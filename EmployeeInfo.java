package com.map;

public class EmployeeInfo {
	    int employeeId;
		String employeeName;
		

		public EmployeeInfo(int id, String name) {
			this.employeeId = id;
			this.employeeName = name;
			
		}

		@Override
		public String toString() {
			return "[employeeId=" + employeeId + "\t, employeeName=" + employeeName + "]";
		} 

		
	public boolean equals(Object obj) {
		EmployeeInfo emp = (EmployeeInfo) obj;
			if (this == null)
				return false;
			else if (this == obj)
				return true;
			else if (this.employeeId == emp.employeeId)
				return true;
			else if (this.getClass() == obj.getClass())
				return false;
        		else
				return false;
	
		}
	
	
		public int hashCode() {
			final int PRIME = 31;
			int result = 1;
			result = PRIME * result + this.employeeId;
			return result;

		}

	}

