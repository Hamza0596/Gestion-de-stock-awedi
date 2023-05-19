import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../../services/products.service';
import { PageEvent } from '@angular/material/paginator';
import { MatDialog } from '@angular/material/dialog';
import { AddProductDialogComponent } from '../add-product-dialog/add-product-dialog.component';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss'],
})
export class ProductsComponent implements OnInit {
  products!: any;
  paginationParams: { page: number; size: number } | undefined;

  productsColumns = [
    { columnDef: 'code', header: 'Code' },
    { columnDef: 'designation', header: 'Designation' },
    { columnDef: 'price', header: 'Price (euros)' },
    { columnDef: 'leadTime', header: 'LeadTime (jours)' },
    { columnDef: 'stockMin', header: 'StockMin' },
  ];
  constructor(
    private productService: ProductsService,
    public dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.getAllProducts();
  }

  getAllProducts() {
    this.productService
      .getProducts(0, 10)
      .subscribe((res) => (this.products = res));
  }

  updateProductsOnPagination(pageEvent: PageEvent) {
    this.productService
      .getProducts(pageEvent.pageIndex, pageEvent.pageSize)
      .subscribe((res) => (this.products = res));
  }

  openAddProductDialog() {
    let dialogRef = this.dialog.open(AddProductDialogComponent, {
      height: '600px',
      width: '350px',
    });
    dialogRef.afterClosed().subscribe((result) => {
      this.getAllProducts();
    });
  }
}
