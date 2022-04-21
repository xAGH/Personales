import { TestBed } from '@angular/core/testing';

import { DigitosService } from './digitos.service';

describe('DigitosService', () => {
  let service: DigitosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DigitosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
