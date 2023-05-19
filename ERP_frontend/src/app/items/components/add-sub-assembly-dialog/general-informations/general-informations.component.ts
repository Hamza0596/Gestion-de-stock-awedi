import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { ProductsService } from 'src/app/items/services/products.service';

@Component({
  selector: 'app-general-informations',
  templateUrl: './general-informations.component.html',
  styleUrls: ['./general-informations.component.scss'],
})
export class GeneralInformationsComponent implements OnInit {
  @Input() form!: FormGroup;
  categories!: any;
  constructor(private productService: ProductsService) {}

  ngOnInit(): void {
    this.getAllCategories();
  }

  getAllCategories() {
    this.productService
      .getCategories()
      .subscribe((res) => (this.categories = res));
  }
}
