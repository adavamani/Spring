package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

@EntityScan
/**
 * UserModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-12T11:33:32.539-05:00[America/Chicago]")
@Entity
@Table(name = "users")
public class UserModel   {
  @Id //primary key
  @Column(name="id", unique=true, updatable=false, nullable=false)
  @JsonProperty("id")
  private String id;
  
  @Column(name="firstName", unique=false, updatable=true, nullable=false)
  @JsonProperty("firstName")
  private String firstName;

  @Column(name="lastName", unique=false, updatable=true, nullable=false)
  @JsonProperty("lastName")
  private String lastName;

  @Column(name="role", unique=false, updatable=true, nullable=false)
  @JsonProperty("role")
  private String role;

  public UserModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserModel firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(example = "Amal", value = "")

@Size(min=1,max=40) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserModel lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @ApiModelProperty(example = "raj", value = "")

@Size(min=1,max=40) 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserModel role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @ApiModelProperty(value = "")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserModel userModel = (UserModel) o;
    return Objects.equals(this.id, userModel.id) &&
        Objects.equals(this.firstName, userModel.firstName) &&
        Objects.equals(this.lastName, userModel.lastName) &&
        Objects.equals(this.role, userModel.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

