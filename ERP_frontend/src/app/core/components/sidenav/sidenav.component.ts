import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.scss'],
})
export class SidenavComponent implements OnInit {
  constructor(private router: Router) {}

  ngOnInit(): void {}

  toProducts() {
    this.router.navigate(['dashboard/articles/produits']);
  }

  toSubAssemblies() {
    this.router.navigate(['dashboard/articles/sous-assemblages']);
  }
}
