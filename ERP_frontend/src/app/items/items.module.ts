import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SharedModule } from '../shared/shared.module';
import { ItemsRoutingModule } from './items-routing.module';
import { ProductsComponent } from './components/products/products.component';
import { AddProductDialogComponent } from './components/add-product-dialog/add-product-dialog.component';
import { SubAssembliesComponent } from './components/sub-assemblies/sub-assembly.component';
import { AddSubAssemblyDialogComponent } from './components/add-sub-assembly-dialog/add-sub-assembly-dialog.component';
import { GeneralInformationsComponent } from './components/add-sub-assembly-dialog/general-informations/general-informations.component';
import { ProductionInformationsComponent } from './components/add-sub-assembly-dialog/production-informations/production-informations.component';
import { CostInformationsComponent } from './components/add-sub-assembly-dialog/cost-informations/cost-informations.component';

@NgModule({
  declarations: [
    ProductsComponent,
    AddProductDialogComponent,
    SubAssembliesComponent,
    AddSubAssemblyDialogComponent,
    GeneralInformationsComponent,
    ProductionInformationsComponent,
    CostInformationsComponent,
  ],
  imports: [CommonModule, SharedModule, ItemsRoutingModule],
})
export class ItemsModule {}
