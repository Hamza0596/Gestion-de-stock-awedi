import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './core/components/login/login.component';
import { RegisterComponent } from './core/components/register/register.component';
import { DashboardComponent } from './core/components/dashboard/dashboard.component';
import { StatistiquesComponent } from './core/components/statistiques/statistiques.component';
import { DatatableComponent } from './shared/components/datatable/datatable.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  {
    path: 'dashboard',
    component: DashboardComponent,
    children: [
      { path: 'statistiques', component: StatistiquesComponent },
      { path: 'datatable', component: DatatableComponent },
      {
        path: 'clients',
        loadChildren: () =>
          import('./customer/customer.module').then((m) => m.CustomerModule),
      },
      {
        path: 'articles',
        loadChildren: () =>
          import('./items/items.module').then((m) => m.ItemsModule),
      },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
