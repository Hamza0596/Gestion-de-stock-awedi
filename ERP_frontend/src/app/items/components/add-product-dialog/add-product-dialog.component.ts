import { Component, OnInit } from '@angular/core';
import {
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from '@angular/forms';
import { ProductsService } from '../../services/products.service';

@Component({
  selector: 'app-add-product-dialog',
  templateUrl: './add-product-dialog.component.html',
  styleUrls: ['./add-product-dialog.component.scss'],
})
export class AddProductDialogComponent implements OnInit {
  addProductForm!: FormGroup;
  categories!: any;

  constructor(
    private formBuilder: FormBuilder,
    private productService: ProductsService
  ) {}

  ngOnInit(): void {
    this.addProductForm = this.formBuilder.group({
      code: new FormControl('', [Validators.required]),
      designation: new FormControl('', [Validators.required]),
      leadTime: new FormControl('', [Validators.required]),
      price: new FormControl('', [Validators.required]),
      stockMin: new FormControl('', [Validators.required]),
      category: new FormControl('', [Validators.required]),
    });
    this.getAllCategories();
  }

  addProduct() {
    this.productService
      .addProduct(this.addProductForm.value)
      .subscribe((res) => {
        alert('votre produit a été ajouté avec succés');
      });
  }

  getAllCategories() {
    this.productService
      .getCategories()
      .subscribe((res) => (this.categories = res));
  }
}
