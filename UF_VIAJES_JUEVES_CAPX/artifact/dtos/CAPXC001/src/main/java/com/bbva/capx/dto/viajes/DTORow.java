package com.bbva.capx.dto.viajes;

import java.util.List;

import com.bbva.apx.dto.AbstractDTO;

public class DTORow extends AbstractDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6267121875699765633L;
	private List<DtoElement> elements;
	/**
	 * 
	 */
	public DTORow() {
		super();
	}
	/**
	 * @return the elements
	 */
	public List<DtoElement> getElements() {
		return elements;
	}
	/**
	 * @param elements the elements to set
	 */
	public void setElements(List<DtoElement> elements) {
		this.elements = elements;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elements == null) ? 0 : elements.hashCode());
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
		DTORow other = (DTORow) obj;
		if (elements == null) {
			if (other.elements != null)
				return false;
		} else if (!elements.equals(other.elements))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DTORow [elements=" + elements + "]";
	} 
}
