package com.bbva.capx.dto.viajes;
import com.bbva.apx.dto.AbstractDTO;

public class DtoIn extends AbstractDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8511523837024284821L;
	private String originPoint;
	private String destinationPoint;
	/**
	 * 
	 */
	public DtoIn() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the originPoint
	 */
	public String getOriginPoint() {
		return originPoint;
	}
	/**
	 * @param originPoint the originPoint to set
	 */
	public void setOriginPoint(String originPoint) {
		this.originPoint = originPoint;
	}
	/**
	 * @return the destinationPoint
	 */
	public String getDestinationPoint() {
		return destinationPoint;
	}
	/**
	 * @param destinationPoint the destinationPoint to set
	 */
	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ViajeDataIn [originPoint=" + originPoint + ", destinationPoint=" + destinationPoint + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destinationPoint == null) ? 0 : destinationPoint.hashCode());
		result = prime * result + ((originPoint == null) ? 0 : originPoint.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DtoIn other = (DtoIn) obj;
		if (destinationPoint == null) {
			if (other.destinationPoint != null)
				return false;
		} else if (!destinationPoint.equals(other.destinationPoint))
			return false;
		if (originPoint == null) {
			if (other.originPoint != null)
				return false;
		} else if (!originPoint.equals(other.originPoint))
			return false;
		return true;
	}
}
