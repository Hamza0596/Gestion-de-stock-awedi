import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-production-informations',
  templateUrl: './production-informations.component.html',
  styleUrls: ['./production-informations.component.scss'],
})
export class ProductionInformationsComponent implements OnInit {
  @Input() form!: FormGroup;

  constructor() {}

  ngOnInit(): void {}
}
