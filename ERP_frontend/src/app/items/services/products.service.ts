import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ProductsService {
  constructor(private http: HttpClient) {}

  public getProducts(page: number, pageSize: number): Observable<any> {
    return this.http.get<any>(
      `http://localhost:8080/erp/product/${page}/${pageSize}`
    );
  }

  public addProduct(product: any): Observable<any> {
    return this.http.post<any>(`http://localhost:8080/erp/product`, product);
  }

  public getCategories(): Observable<any> {
    return this.http.get<any>(`http://localhost:8080/erp/category`);
  }
}
