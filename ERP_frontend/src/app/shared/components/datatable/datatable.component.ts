import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { PageEvent } from '@angular/material/paginator';

@Component({
  selector: 'app-datatable',
  templateUrl: './datatable.component.html',
  styleUrls: ['./datatable.component.scss'],
})
export class DatatableComponent implements OnInit {
  @Input() dataSource!: any;
  @Input() columns!: any;
  @Output() paginationEvent = new EventEmitter<PageEvent>();

  pageEvent!: PageEvent;
  displayedColumns!: string[];

  columnWidth!: number;

  constructor() {}

  ngOnInit(): void {
    this.displayedColumns = this.columns.map((x: any) => x.columnDef);
    this.columnWidth = 100 / this.displayedColumns.length;
  }

  onPaginateChange(pageEvent: PageEvent) {
    this.paginationEvent.emit(pageEvent);
  }
}
