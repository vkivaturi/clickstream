package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EventRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-09T19:41:12.483939300+05:30[Asia/Calcutta]")
public class EventRequest {

  private String type;

  private String pointer;

  private String pageURL;

  private String elementClass;

  private String elementId;

  private String elementName;

  private String elementText;

  public EventRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EventRequest pointer(String pointer) {
    this.pointer = pointer;
    return this;
  }

  /**
   * Get pointer
   * @return pointer
  */
  
  @Schema(name = "pointer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointer")
  public String getPointer() {
    return pointer;
  }

  public void setPointer(String pointer) {
    this.pointer = pointer;
  }

  public EventRequest pageURL(String pageURL) {
    this.pageURL = pageURL;
    return this;
  }

  /**
   * Get pageURL
   * @return pageURL
  */
  
  @Schema(name = "pageURL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageURL")
  public String getPageURL() {
    return pageURL;
  }

  public void setPageURL(String pageURL) {
    this.pageURL = pageURL;
  }

  public EventRequest elementClass(String elementClass) {
    this.elementClass = elementClass;
    return this;
  }

  /**
   * Get elementClass
   * @return elementClass
  */
  
  @Schema(name = "elementClass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementClass")
  public String getElementClass() {
    return elementClass;
  }

  public void setElementClass(String elementClass) {
    this.elementClass = elementClass;
  }

  public EventRequest elementId(String elementId) {
    this.elementId = elementId;
    return this;
  }

  /**
   * Get elementId
   * @return elementId
  */
  
  @Schema(name = "elementId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementId")
  public String getElementId() {
    return elementId;
  }

  public void setElementId(String elementId) {
    this.elementId = elementId;
  }

  public EventRequest elementName(String elementName) {
    this.elementName = elementName;
    return this;
  }

  /**
   * Get elementName
   * @return elementName
  */
  
  @Schema(name = "elementName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementName")
  public String getElementName() {
    return elementName;
  }

  public void setElementName(String elementName) {
    this.elementName = elementName;
  }

  public EventRequest elementText(String elementText) {
    this.elementText = elementText;
    return this;
  }

  /**
   * Get elementText
   * @return elementText
  */
  
  @Schema(name = "elementText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementText")
  public String getElementText() {
    return elementText;
  }

  public void setElementText(String elementText) {
    this.elementText = elementText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRequest eventRequest = (EventRequest) o;
    return Objects.equals(this.type, eventRequest.type) &&
        Objects.equals(this.pointer, eventRequest.pointer) &&
        Objects.equals(this.pageURL, eventRequest.pageURL) &&
        Objects.equals(this.elementClass, eventRequest.elementClass) &&
        Objects.equals(this.elementId, eventRequest.elementId) &&
        Objects.equals(this.elementName, eventRequest.elementName) &&
        Objects.equals(this.elementText, eventRequest.elementText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, pointer, pageURL, elementClass, elementId, elementName, elementText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
    sb.append("    pageURL: ").append(toIndentedString(pageURL)).append("\n");
    sb.append("    elementClass: ").append(toIndentedString(elementClass)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    elementName: ").append(toIndentedString(elementName)).append("\n");
    sb.append("    elementText: ").append(toIndentedString(elementText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

