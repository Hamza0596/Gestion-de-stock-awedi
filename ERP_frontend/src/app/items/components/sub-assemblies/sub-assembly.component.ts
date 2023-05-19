import { Component, OnInit } from '@angular/core';
import { SubAssemblyService } from '../../services/sub-assembly.service';
import { MatDialog } from '@angular/material/dialog';
import { AddSubAssemblyDialogComponent } from '../add-sub-assembly-dialog/add-sub-assembly-dialog.component';

@Component({
  selector: 'app-sub-assemblies',
  templateUrl: './sub-assemblies.component.html',
  styleUrls: ['./sub-assemblies.component.scss'],
})
export class SubAssembliesComponent implements OnInit {
  subAssemblies!: any;
  subAssembliesColumns = [
    { columnDef: 'code', header: 'Code' },
    { columnDef: 'designation', header: 'Désignation' },
    { columnDef: 'preparationTime', header: 'Temps de préparation' },
    { columnDef: 'manufacturingTime', header: 'Temps de fabrication' },
    { columnDef: 'waitingTime', header: "Temps d'attente" },
    { columnDef: 'deliveryTime', header: 'Temps de livraison' },
    { columnDef: 'manufacturingCost', header: 'Cout de fabrication' },
    { columnDef: 'deliveryCost', header: 'Cout de livraison' },
    { columnDef: 'numberOperators', header: "Nombre d'opérateurs" },
  ];

  constructor(
    private subAssemblyService: SubAssemblyService,
    public dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.getAllSubAssemblies();
  }

  getAllSubAssemblies() {
    this.subAssemblyService
      .getSubAssemblies(0, 10)
      .subscribe((res) => (this.subAssemblies = res));
  }

  openAddSubAssemblyDialog() {
    let dialogRef = this.dialog.open(AddSubAssemblyDialogComponent, {
      height: '510px',
      width: '700px',
    });
    dialogRef.afterClosed().subscribe((result) => {
      this.getAllSubAssemblies();
    });
  }
}
