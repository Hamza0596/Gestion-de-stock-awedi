import { TestBed } from '@angular/core/testing';

import { SubAssemblyService } from './sub-assembly.service';

describe('SubAssemblyService', () => {
  let service: SubAssemblyService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SubAssemblyService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
