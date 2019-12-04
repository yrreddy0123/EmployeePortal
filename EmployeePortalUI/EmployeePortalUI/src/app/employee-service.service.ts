import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { retry, catchError } from 'rxjs/operators';
import {  throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {

  
  private SERVER_URL = "http://localhost:9090/api";
  private GET_ALL_EMPLOYEES = this.SERVER_URL+"/employee/getAll";
  private REGISTER_EMPLOYEE = this.SERVER_URL+"/employee/register"

  constructor(private httpClient: HttpClient) { }

  public getAllEmployees(){  
		return this.httpClient.get(this.GET_ALL_EMPLOYEES).pipe(catchError(this.handleError));  
  }  

  
  public registerUser(employee: import("./Employee").Employee) {
    return this.httpClient.post(this.REGISTER_EMPLOYEE,employee)
  }

  
  handleError(error: HttpErrorResponse) {
    let errorMessage = 'Unknown error!';
    if (error.error instanceof ErrorEvent) {
      // Client-side errors
      errorMessage = `Error: ${error.error.message}`;
    } else {
      // Server-side errors
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    window.alert(errorMessage);
    return throwError(errorMessage);
  }
}
