import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SharedModule } from '../shared/shared.module';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { JwtHelperService, JWT_OPTIONS } from '@auth0/angular-jwt';
import { SidenavComponent } from './components/sidenav/sidenav.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { StatistiquesComponent } from './components/statistiques/statistiques.component';

@NgModule({
  declarations: [LoginComponent, RegisterComponent, SidenavComponent, DashboardComponent, StatistiquesComponent],
  imports: [CommonModule, SharedModule],
  providers: [
    { provide: JWT_OPTIONS, useValue: JWT_OPTIONS },
    JwtHelperService,
  ],
})
export class CoreModule {}
