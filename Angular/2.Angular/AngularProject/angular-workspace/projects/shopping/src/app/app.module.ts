import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from "@angular/forms";
import { DataBindingComponent } from './components/DataBinding/data-binding/data-binding.component';
import { DemoComponent } from './components/demo/demo.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import { FormtemplateComponent } from './components/formtemplate/formtemplate.component';
@NgModule({
  declarations: [
    DataBindingComponent,
    DemoComponent,
    FormtemplateComponent
  ],
  imports: [
    BrowserModule,FormsModule, BrowserAnimationsModule,
    MatDatepickerModule,MatFormFieldModule
  ],
  providers: [],
  bootstrap: [FormtemplateComponent]
})
export class AppModule { }
