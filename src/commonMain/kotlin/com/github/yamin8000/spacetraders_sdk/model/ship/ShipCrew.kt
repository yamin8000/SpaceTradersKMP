package com.github.yamin8000.spacetraders_sdk.model.ship

import kotlinx.serialization.Serializable

/**
 * The ship's crew service and maintain the ship's systems and equipment.
 * @param current The current number of crew members on the ship.
 * @param required The minimum number of crew members required to maintain the ship.
 * @param capacity The maximum number of crew members the ship can support.
 * @param morale A rough measure of the crew's morale. A higher morale means the crew is happier and more productive. A lower morale means the ship is more prone to accidents.
 * @param wages The amount of credits per crew member paid per hour. Wages are paid when a ship docks at a civilized waypoint.
 * @param rotation The rotation of crew shifts. A stricter shift improves the ship's performance. A more relaxed shift improves the crew's morale.
 */
@Serializable
data class ShipCrew(
    val current: Int,
    val required: Int,
    val capacity: Int,
    val morale: Int,
    val wages: Int,
    val rotation: ShipCrewRotation = ShipCrewRotation.STRICT
)
