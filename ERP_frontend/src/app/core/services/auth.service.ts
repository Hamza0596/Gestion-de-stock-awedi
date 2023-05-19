import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, catchError, throwError } from 'rxjs';
import { JwtHelperService } from '@auth0/angular-jwt';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  constructor(private http: HttpClient, private jwtHelper: JwtHelperService) {}

  public login(user: any): Observable<any> {
    return this.http.post<any>(
      `http://localhost:8080/erp/auth/authenticate`,
      user
    );
  }

  public register(user: any): Observable<any> {
    return this.http.post<any>(`http://localhost:8080/erp/auth/register`, user);
  }

  public isAuthenticated(): boolean {
    const token = localStorage.getItem('token');
    return !this.jwtHelper.isTokenExpired(token);
  }

  public getTokenPyload(): any {
    const token = localStorage.getItem('token');
    const tokenPayload =
      token !== null ? this.jwtHelper.decodeToken(token) : {};
    return tokenPayload;
  }
}
