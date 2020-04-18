package org.wicket.calltree.services

import org.wicket.calltree.dto.BcpEventDto
import org.wicket.calltree.models.BcpEvent

/**
 * @author Alessandro Arosio - 15/04/2020 22:50
 */
interface BcpEventService {
  fun getAllEvents() : List<BcpEventDto>

  fun getEventsByName(name: String) : List<BcpEventDto>

  fun getEventById(id: Long) : BcpEventDto

  fun saveEvent(eventDto: BcpEventDto) : BcpEventDto

}