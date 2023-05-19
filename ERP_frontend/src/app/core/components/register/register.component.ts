import { Component, OnInit } from '@angular/core';
import {
  FormGroup,
  FormBuilder,
  Validators,
  FormControl,
} from '@angular/forms';
import { AuthService } from '../../services/auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss'],
})
export class RegisterComponent implements OnInit {
  registerForm!: FormGroup;
  constructor(
    private formBuilder: FormBuilder,
    private authService: AuthService
  ) {}

  ngOnInit(): void {
    this.registerForm = this.formBuilder.group({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [
        Validators.required,
        Validators.pattern(
          /(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*#?&^_-]).{8,}/
        ),
      ]),
      confirmPassword: new FormControl('', [
        Validators.required,
        Validators.pattern(
          /(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*#?&^_-]).{8,}/
        ),
      ]),
      lastName: new FormControl('', [
        Validators.required,
        Validators.minLength(2),
      ]),
      firstName: new FormControl('', [
        Validators.required,
        Validators.minLength(2),
      ]),
      phone: new FormControl('', [
        Validators.required,

        Validators.max(99999999),
        Validators.min(10000000),
      ]),
    });
  }

  register() {
    if (
      this.registerForm.value.password ===
      this.registerForm.value.confirmPassword
    ) {
      this.authService.register(this.registerForm.value).subscribe(
        (res) => alert(res.msg),
        (err) => alert(err.error.msg)
      );
    } else alert('vérifier votre mot passe !');
  }
}
