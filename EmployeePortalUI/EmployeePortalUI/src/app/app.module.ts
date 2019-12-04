import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule,MatCardModule,MatIconModule, MatButtonModule,MatProgressSpinnerModule,MatSliderModule } from '@angular/material';
import { RegisterComponent } from './register/register.component';
import { AllEmployeesComponent } from './all-employees/all-employees.component';
import {MatDatepickerModule,MatNativeDateModule,MatCheckboxModule,MatFormFieldModule,MatInputModule,MatRadioModule,MatListModule} from  '@angular/material';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
const routes: Routes = [
  { path: '', redirectTo: '/', pathMatch: 'full' },
  { path: 'register', component: RegisterComponent },
  { path: 'allEmployees', component: AllEmployeesComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    AllEmployeesComponent
  ],
  imports: [
    [RouterModule.forRoot(routes)],
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatToolbarModule,MatCardModule,MatIconModule, MatButtonModule,MatProgressSpinnerModule,MatSliderModule,
    MatDatepickerModule,MatNativeDateModule,MatCheckboxModule,MatFormFieldModule,MatInputModule,MatRadioModule,MatListModule,
    FormsModule, ReactiveFormsModule
  ],
  exports: [RouterModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
