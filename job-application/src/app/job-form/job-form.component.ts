import { Component } from '@angular/core';

@Component({
  selector: 'app-job-form',
  templateUrl: './job-form.component.html',
  styleUrls: ['./job-form.component.css']
})
export class JobFormComponent {
  jobTitle: string ="";

  apply() {
    // Handle the button click event here
    console.log('Job title:', this.jobTitle);
  }
}
