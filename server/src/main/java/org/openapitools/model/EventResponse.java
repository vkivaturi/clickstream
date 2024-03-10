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
 * EventResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-09T19:41:12.483939300+05:30[Asia/Calcutta]")
public class EventResponse {

  private String id;

  private String type;

  private String pointer;

  private String pageURL;

  private String elementClass;

  private String elementId;

  private String elementName;

  private String elementText;

  private String createdTime;

  public EventResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EventResponse type(String type) {
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

  public EventResponse pointer(String pointer) {
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

  public EventResponse pageURL(String pageURL) {
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

  public EventResponse elementClass(String elementClass) {
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

  public EventResponse elementId(String elementId) {
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

  public EventResponse elementName(String elementName) {
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

  public EventResponse elementText(String elementText) {
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

  public EventResponse createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
  */
  
  @Schema(name = "createdTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdTime")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventResponse eventResponse = (EventResponse) o;
    return Objects.equals(this.id, eventResponse.id) &&
        Objects.equals(this.type, eventResponse.type) &&
        Objects.equals(this.pointer, eventResponse.pointer) &&
        Objects.equals(this.pageURL, eventResponse.pageURL) &&
        Objects.equals(this.elementClass, eventResponse.elementClass) &&
        Objects.equals(this.elementId, eventResponse.elementId) &&
        Objects.equals(this.elementName, eventResponse.elementName) &&
        Objects.equals(this.elementText, eventResponse.elementText) &&
        Objects.equals(this.createdTime, eventResponse.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, pointer, pageURL, elementClass, elementId, elementName, elementText, createdTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
    sb.append("    pageURL: ").append(toIndentedString(pageURL)).append("\n");
    sb.append("    elementClass: ").append(toIndentedString(elementClass)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    elementName: ").append(toIndentedString(elementName)).append("\n");
    sb.append("    elementText: ").append(toIndentedString(elementText)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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

