    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 		<div class = "left-container">
			<img class="dealer_logo_left" src="/CarPay/img/logo_fsvolvo_228x74.png" width="228" height="74"/>
			<img class="vehicle_left" src="${vehicle.getImageURL() }" width="249" height="166"/>
			<div class="carTitle">${vehicle.getDescription()}</div>
			<div class="vdata-container" >
				<div class="carPrice" style="width:84px">${vehicle.getSalePrice() }</div>
				<div class="sticker_price"><strike style="padding-top:0px;">${vehicle.getStickerPrice() }</strike></div>
			</div>
			<div class="vdata-container">
				<table>
					<c:if test="${vehicle.getEngine() != null }">
						<tr>
							<td class="vattr-name">Engine:</td><td class="vattr-value">
							<c:if test="${vehicle.getEngine().length() > 20 }">
								${vehicle.getEngine().substring(0,20) }
							</c:if>
							<c:if test="${vehicle.engine.length() <= 20 }">
								${vehicle.engine }
							</c:if>	
							</td>
						</tr>
					</c:if>
					<c:if test = "{vehicle.transmission}">
						<tr>
							<td class="vattr-name">Transmission:</td><td class="vattr-value">
							<c:if test="${vehicle.transmission.size() > 20 }">
								${vehicle.tranmission.substring(0,20)}
							</c:if>
							<c:if test="${vehicle.tranmission.size() <= 20 }">
								${vehicle.transmission }
							</c:if>
							</td>
						</tr>	
					</c:if>
					<c:if test="${vehicle.exteriorColor }">
						<tr>
							<td class="vattr-name">Exterior Color:</td><td class="vattr-value">
								<c:if test="${vehicle.exteriorColor.size() > 20 }">
									${vehicle.exteriorColor.substring(0,20)}
								</c:if>
								<c:if test="${vehicle.exteriorColor.size() <= 20 }">
									${vehicle.exteriorColor}
								</c:if>
							</td>
						</tr>
					</c:if>
					<c:if test="${vehicle.exteriorColor }">
						<tr>
							<td class="vattr-name">Exterior Color:</td><td class="vattr-value">
								<c:if test="${vehicle.exteriorColor.size() > 20 }">
									${vehicle.exteriorColor.substring(0,20)}
								</c:if>
								<c:if test="${vehicle.exteriorColor.size() <= 20 }">
									${vehicle.exteriorColor}
								</c:if>
							</td>
						</tr>
					</c:if>
					<c:if test="${vehicle.vehiclePK.vin }">
						<tr>
							<td class="vattr-name">VIN:</td><td class="vattr-value">${vehicle.vehiclePK.vin}</td>
						</tr>
					</c:if>
					<c:if test="${vehicle.modelCode }">
						<tr>
							<td class="vattr-name">Model Code:</td><td class="vattr-value">${vehicle.modelCode}</td>
						</tr>
					</c:if>
					<c:if test="${vehicle.stockNumber }">
						<tr>
							<td class="vattr-name">Stock #:</td><td class="vattr-value">${vehicle.stockNumber}</td>
						</tr>
					</c:if>
					<c:if test="${vehicle.mileage > 0 }">
						<tr>
							<td class="vattr-name">Mileage:</td><td class="vattr-value">${vehicle.mileage}</td>
						</tr>
					</c:if>
				</table>
			</div>
 
 
 		</div>
