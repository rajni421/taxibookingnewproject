package tech.codehunt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Generates a toString method including all fields.
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="contactform")
public class ContactForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty(message="Name cannot be Empty")
	@Size(min =2 ,max=30,message="Inalid Name Size")
	@Column(length = 30)
	private String name;
	
	@NotEmpty(message="Email cannot be Empty")
	@Size(min =5 ,max=50,message="Inalid Email Size")
	@Column(length = 50)
	private String email;
	
	@NotNull(message = "Phone No cant be Empty")
	@Min(value= 1000000000 ,message="Phone No must be at least 10 digits")
	@Max(value= 9999999999L ,message="Phone No must be at least 10 digits")
	@Column(length = 10)
    private Long phone;
	
	@NotEmpty(message="Message cannot be Empty")
	@Size(min =3 ,max=500, message="Inalid Message Size")
	@Column(length = 500)
	private String message;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ContactForm [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", message="
				+ message + "]";
	}

	public ContactForm(int id,
			@NotEmpty(message = "Name cannot be Empty") @Size(min = 2, max = 30, message = "Inalid Name Size") String name,
			@NotEmpty(message = "Email cannot be Empty") @Size(min = 5, max = 50, message = "Inalid Email Size") String email,
			@NotNull(message = "Phone No cant be Empty") @Min(value = 1000000000, message = "Phone No must be at least 10 digits") @Max(value = 999999999, message = "Phone No must be at least 10 digits") Long phone,
			@NotEmpty(message = "Message cannot be Empty") @Size(min = 3, max = 500, message = "Inalid Message Size") String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.message = message;
	}

	public ContactForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}