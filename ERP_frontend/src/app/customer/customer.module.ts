import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustomersComponent } from './components/customers/customers.component';
import { CustomerRoutingModule } from './customer-routing.module';
import { SharedModule } from '../shared/shared.module';

@NgModule({
  declarations: [CustomersComponent],
  imports: [CommonModule, CustomerRoutingModule, SharedModule],
})
export class CustomerModule {}
