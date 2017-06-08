package course.application.web.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class Course implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="COURSENAME")
	private String coursename;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "UNIVERSITY_COURSE", 
    joinColumns = @JoinColumn(name = "COURSE_ID", referencedColumnName = "id"), 
    inverseJoinColumns = @JoinColumn(name = "UNIVERSITY_DOMAIN", referencedColumnName = "domain"))
    private Set<University> universities;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Set<University> getUniversities() {
		return universities;
	}

	public void setUniversities(Set<University> universities) {
		this.universities = universities;
	}
	
	
	
	
	
}
