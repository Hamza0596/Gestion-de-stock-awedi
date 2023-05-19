import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { HttpClientModule } from '@angular/common/http';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatDividerModule } from '@angular/material/divider';
import { RouterModule } from '@angular/router';
import { MatExpansionModule } from '@angular/material/expansion';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { DatatableComponent } from './components/datatable/datatable.component';
import { MatTableModule } from '@angular/material/table';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatDialogModule } from '@angular/material/dialog';
import { MatSelectModule } from '@angular/material/select';
import { MatStepperModule } from '@angular/material/stepper';

const MaterialComponents = [
  MatButtonModule,
  MatFormFieldModule,
  MatInputModule,
  MatToolbarModule,
  MatSidenavModule,
  MatDividerModule,
  MatExpansionModule,
  MatListModule,
  MatIconModule,
  MatTableModule,
  MatPaginatorModule,
  MatDialogModule,
  MatSelectModule,
  MatStepperModule,
];

@NgModule({
  declarations: [DatatableComponent],
  imports: [
    CommonModule,
    MaterialComponents,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  exports: [
    MaterialComponents,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule,
    DatatableComponent,
  ],
})
export class SharedModule {}
