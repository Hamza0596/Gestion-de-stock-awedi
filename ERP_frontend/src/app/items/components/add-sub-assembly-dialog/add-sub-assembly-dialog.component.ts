import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Validators } from '@angular/forms';
import { FormBuilder, FormGroup } from '@angular/forms';
import { SubAssemblyService } from '../../services/sub-assembly.service';

@Component({
  selector: 'app-add-sub-assembly-dialog',
  templateUrl: './add-sub-assembly-dialog.component.html',
  styleUrls: ['./add-sub-assembly-dialog.component.scss'],
})
export class AddSubAssemblyDialogComponent implements OnInit {
  generalInformationsForm!: FormGroup;

  producationInformationsForm!: FormGroup;

  costInformationsForm!: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private subAssemblyService: SubAssemblyService
  ) {}

  ngOnInit(): void {
    this.generalInformationsForm = this.formBuilder.group({
      code: new FormControl('', [Validators.required]),
      designation: new FormControl('', [Validators.required]),
      deliveryTime: new FormControl('', [Validators.required]),
      category: new FormControl('', [Validators.required]),
    });

    this.producationInformationsForm = this.formBuilder.group({
      preparationTime: new FormControl('', [Validators.required]),
      waitingTime: new FormControl('', [Validators.required]),
      manufacturingTime: new FormControl('', [Validators.required]),
      numberOperators: new FormControl('', [Validators.required]),
    });

    this.costInformationsForm = this.formBuilder.group({
      manufacturingCost: new FormControl('', [Validators.required]),
      deliveryCost: new FormControl('', [Validators.required]),
    });
  }

  addSubAssembly() {
    let subAssembly = {
      ...this.costInformationsForm.value,
      ...this.generalInformationsForm.value,
      ...this.producationInformationsForm.value,
    };

    this.subAssemblyService
      .addSubAssembly(subAssembly)
      .subscribe((res) => alert('le sous-assemblage est ajouté avec succès'));

    console.log(subAssembly);
  }
}
