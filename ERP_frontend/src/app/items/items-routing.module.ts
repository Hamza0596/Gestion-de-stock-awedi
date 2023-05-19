import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductsComponent } from './components/products/products.component';
import { SubAssembliesComponent } from './components/sub-assemblies/sub-assembly.component';

const routes: Routes = [
  {
    path: 'produits',
    component: ProductsComponent,
  },
  {
    path: 'sous-assemblages',
    component: SubAssembliesComponent,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ItemsRoutingModule {}
