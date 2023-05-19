import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class SubAssemblyService {
  constructor(private http: HttpClient) {}

  public getSubAssemblies(page: number, pageSize: number): Observable<any> {
    return this.http.get<any>(
      `http://localhost:8080/erp/subAssembly/${page}/${pageSize}`
    );
  }

  public addSubAssembly(subAssembly: any): Observable<any> {
    return this.http.post<any>(
      `http://localhost:8080/erp/subAssembly`,
      subAssembly
    );
  }
}
