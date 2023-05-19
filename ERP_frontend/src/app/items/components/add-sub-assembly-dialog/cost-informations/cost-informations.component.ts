import { Component, Input, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-cost-informations',
  templateUrl: './cost-informations.component.html',
  styleUrls: ['./cost-informations.component.scss'],
})
export class CostInformationsComponent implements OnInit {
  @Input() form!: FormGroup;

  constructor() {}

  ngOnInit(): void {}
}
