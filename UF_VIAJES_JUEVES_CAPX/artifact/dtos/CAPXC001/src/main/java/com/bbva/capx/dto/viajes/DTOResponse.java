package com.bbva.capx.dto.viajes;

import java.util.List;

import com.bbva.apx.dto.AbstractDTO;

public class DTOResponse extends AbstractDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5010478585264480361L;
	private List<String> destinationAddresses;
	private List<String> originAddresses;
	private List<DTORow> rows;
	private String status;
	
	
	
	/**
	 * 
	 */
	public DTOResponse() {
		super();
	}
	/**
	 * @return the destinationAddresses
	 */
	public List<String> getDestinationAddresses() {
		return destinationAddresses;
	}
	/**
	 * @param destinationAddresses the destinationAddresses to set
	 */
	public void setDestinationAddresses(List<String> destinationAddresses) {
		this.destinationAddresses = destinationAddresses;
	}
	/**
	 * @return the originAddresses
	 */
	public List<String> getOriginAddresses() {
		return originAddresses;
	}
	/**
	 * @param originAddresses the originAddresses to set
	 */
	public void setOriginAddresses(List<String> originAddresses) {
		this.originAddresses = originAddresses;
	}
	/**
	 * @return the rows
	 */
	public List<DTORow> getRows() {
		return rows;
	}
	/**
	 * @param rows the rows to set
	 */
	public void setRows(List<DTORow> rows) {
		this.rows = rows;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destinationAddresses == null) ? 0 : destinationAddresses.hashCode());
		result = prime * result + ((originAddresses == null) ? 0 : originAddresses.hashCode());
		result = prime * result + ((rows == null) ? 0 : rows.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		DTOResponse other = (DTOResponse) obj;
		if (destinationAddresses == null) {
			if (other.destinationAddresses != null)
				return false;
		} else if (!destinationAddresses.equals(other.destinationAddresses))
			return false;
		if (originAddresses == null) {
			if (other.originAddresses != null)
				return false;
		} else if (!originAddresses.equals(other.originAddresses))
			return false;
		if (rows == null) {
			if (other.rows != null)
				return false;
		} else if (!rows.equals(other.rows))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DTOResponse [destinationAddresses=" + destinationAddresses + ", originAddresses=" + originAddresses
				+ ", rows=" + rows + ", status=" + status + "]";
	}
}
