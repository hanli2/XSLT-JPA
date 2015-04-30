package hw6;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(value=XmlAccessType.FIELD)

public class SiteList {
	@XmlElement(name="site")
	private List<Site> sites;

	public List<Site> getSites() {
		return sites;
	}

    public void setSites(List<Site> sites) {
		this.sites = sites;
	}

	public SiteList(List<Site> sites) {
		super();
		this.sites = sites;
	}
    

	public SiteList() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}