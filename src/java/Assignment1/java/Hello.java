import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Hello extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw;
		res.setContentType("text/html");
		pw=res.getWriter();
		pw.print("<html><head>");
        pw.print("<title>RakshaBandhan</title>");
        pw.print("<style>");
        pw.print("#mainDivision {width:1480px;height:1440px;margin:auto;border_style:solid;background-image:url(https://s-media-cache-ak0.pinimg.com/originals/59/4f/3a/594f3a85a9c21647f25a76ad8861306a.png);background-attachment:fixed;}");
        pw.print("#header{text-align:center; font-family:monospace;font-size:70px;color:#EF5350;}");
        pw.print("#rakshabandhan{height:940px;}");
        pw.print("#rakshaheading{color:#EF5350;font-family:sans-serif;}");
        
        pw.print("#Bandhanimage{width:600px;height:400px;border-style:inset;border-bottom-left-radius:30px;border-bottom-right-radius:30px;border-top-left-radius:30px;border-top-right-radius:30px;}");
        
        pw.print("#content{font-size:30px;color:#004D40;dont-family:sans-sarif}");
        pw.print("#scroller{font-size:25px;color:yellow;background-color:navy;height:25px;}");
        pw.print("#scrollImage{border-style:inset;border-bottom-left-radius:`0px;border-bottom-right-radius:10px;border-top-left-radius:10px;border-top-right-radius:10px;}");
        
        pw.print("#leftSideBar {width:200px; float:left;}");
        pw.print("centerBar {width:1080px;}");
        pw.print("#rightSideBar {width:200px;float:right}");
       
        
        pw.print("</style>");
        pw.print("</head>");
		pw.print("<body>");
		pw.print("<P>");
        
        pw.print("<div id='mainDivision'>");
            
            pw.print("<div id='header'");
            pw.print("<h1><B>Happy RakshaBandhan !!</B></h1>");
            pw.print("</div>");
            
            pw.print("<div id='rakshabandhan'>");
                
                pw.print("<center>");
                pw.print("<table width='100%'>");
                pw.print("<tr>");
                pw.print("<td align='center'>");
                pw.print("<img src='http://www.mapsofindia.com/wallpapers/raksha-bandhan/images/raksha-bandhan-festival-wallpaper.jpg' alt='Happy RakshaBandhan' id='Bandhanimage'>");
                pw.print("</td>");
                pw.print("</tr>");
                pw.print("<tr>");
                pw.print("<td>");
                pw.print("<center> <h1 id='rakshaheading'><u>Importance of Rakshabandhan</u></h1></center>");
                pw.print("</td>");
                pw.print("</tr>");
                pw.print("<tr>");
                pw.print("<td>");
                pw.print("<div id=leftSideBar>");
                pw.print("</div>");
                pw.print("<div id=centerBar>");
                pw.print("<P id='content' align='center'>Raksha Bandhan is now considered as a day to celebrate the sacred relation of a brother and a sister. Yet there have been examples in history where in rakhi has just been a raksha or protection. It could be tied by wife, a daughter or mother. The Rishis tied rakhi to the people who came seeking their blessings. The sages tied the sacred thread to themselves to safe guard them from the evil. It is by all means the 'Papa Todak, Punya Pradayak Parva' or the day that bestows boons and end all sins as it is mentioned in the scriptures.<br>In today's scenario, the day has a different perspective. The occasion involves a pledge of life-time practice of moral, cultural and spiritual values. The values and the sentiments attached to the rituals of this festival are worth inculcating by the whole human race, the sentiments of harmony and peaceful coexistence. The festival of Raksha Bandhan assumes all forms of Raksha or protection, of righteousness and destroyer of all sin. The ritual of Rakhi tying has become so important that come what may, brothers and sisters try to visit each other place on this particular day tin order to bring back the oneness of the family, binding the family together in an emotional bond of love.");
                pw.print("</P>");
                pw.print("</div>");
                pw.print("<div id=rightSideBar>");
                pw.print("</div>");
                pw.print("</td>");
                pw.print("</tr>");
                pw.print("<tr>");
                pw.print("<td>");
                pw.print("<marquee behavior=scroll><img src='http://www.unusualgifts.in/wp-content/uploads/2016/07/Raksha-Bandhan.jpg' alt='MyImage' id='scrollImage'></marquee>");

                pw.print("</td>");
                pw.print("</tr>");
                pw.print("</table>");
                pw.print("</center>");
            
            
            pw.print("</div>");
        
        pw.print("</div>");
        
        pw.print("</P>");
		pw.print("</body>");
		pw.print("</html>");
		pw.close();

	}
}
