package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.EventRequest;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-09T15:26:21.145933100+05:30[Asia/Calcutta]")
public class EventResponse {

  private EventRequest eventRequest;

  public EventResponse eventRequest(EventRequest eventRequest) {
    this.eventRequest = eventRequest;
    return this;
  }

  /**
   * Get eventRequest
   * @return eventRequest
  */
  @Valid 
  @Schema(name = "eventRequest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventRequest")
  public EventRequest getEventRequest() {
    return eventRequest;
  }

  public void setEventRequest(EventRequest eventRequest) {
    this.eventRequest = eventRequest;
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
    return Objects.equals(this.eventRequest, eventResponse.eventRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventResponse {\n");
    sb.append("    eventRequest: ").append(toIndentedString(eventRequest)).append("\n");
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

