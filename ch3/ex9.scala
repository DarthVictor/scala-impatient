val ans = for(elem <- java.util.TimeZone.getAvailableIDs if(elem.startsWith("America/"))) yield elem.split("/")(1)

print(ans.mkString("\n"))