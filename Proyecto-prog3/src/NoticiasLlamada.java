import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class NoticiasLlamada {

	public void llamadaEconomia() throws IOException{
		
		int j=0;
		ArrayList<String> Eco = new ArrayList<>();
		int opcion2=0;
		String noticiasNew2;
		String urlEco = "http://www.eleconomista.es/rss/rss-economia.php";
		Document d2 = Jsoup.connect(urlEco).get();
		Elements el2 = d2.select("title");
		Elements el3 = d2.select("link");
		for (org.jsoup.nodes.Element element : el2) {
			System.out.println(j+") "+element.text()+"\n");
			j++;
		}
		for (org.jsoup.nodes.Element element : el3) {
			
			Eco.add(element.text());
			
		}
		
		
		noticiasNew2=Eco.get(opcion2);
		Document d3 = Jsoup.connect(noticiasNew2).get();
		Elements el4 = d3.select("div#cuerpo_noticia");
			for (org.jsoup.nodes.Element element : el4.select("div.noticiacuerpo")) {
				
				System.out.println(element.text());
				
				}
			
		
	}
	public void llamadaDeportes() throws IOException{
		ArrayList<String> link = new ArrayList<>();
		int i =0;
		int opcion=0;
		String noticianew;

		String urlDeportes = "http://www.losotros18.com/la-liga/";
		Document d = Jsoup.connect(urlDeportes).get();
		Elements el = d.select("div#wrapper");
		for (org.jsoup.nodes.Element element : el.select("div.post-thumbnail")) {
			String title = element.select("div.post-thumbnail a").attr("title");
			String url2 = element.select("div.post-thumbnail a").attr("href");
			String imagen = element.select("div.post-thumbnail img").attr("src");
			System.out.println(i+") "+title+"\n");
			link.add(url2);
			i++;
			}

		
			noticianew=link.get(opcion);
			
			Document d1 = Jsoup.connect(noticianew).get();
			Elements el1 = d1.select("div#wrapper");
			for (org.jsoup.nodes.Element element : el1.select("div.entry-inner")) {
				String full= element.select("div.entry-inner").text();
				System.out.println(full);
			}
			
		
	}
}
