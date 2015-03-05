package MesThreads;
import java.util.List;

import radams.gracenote.webapi.GracenoteWebAPI;

public class ThreadMusic extends Thread{

	private List<String> list_resultats;
	private List<String> list_recales;
	protected GracenoteWebAPI api;

	public ThreadMusic(GracenoteWebAPI api){
		this.api=api;
	}
	
	public List<String> getListResultats(){
		return this.list_resultats;
	}
	
	public void setListResultats(List<String> list){
		this.list_resultats = list;
	}

	public List<String> getListRecales() {
		return list_recales;
	}

	public void setListRecales(List<String> list_recales) {
		this.list_recales = list_recales;
	}
	
	
}
