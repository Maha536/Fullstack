import { TestBed } from '@angular/core/testing';

import { MediafilesService } from './mediafiles.service';

describe('MediafilesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MediafilesService = TestBed.get(MediafilesService);
    expect(service).toBeTruthy();
  });
});
