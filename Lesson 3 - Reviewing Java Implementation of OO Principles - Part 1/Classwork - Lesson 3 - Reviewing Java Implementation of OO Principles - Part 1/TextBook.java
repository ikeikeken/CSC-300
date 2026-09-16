public class TextBook
{
   private String title;     // Title of the book
   private String author;    // Author's last name
   private String publisher; // Name of publisher

   public TextBook(String textTitle, String auth, String pub)
   {
      setTitle(textTitle);
      setAuthor(auth);
      setPublisher(pub);
   }

   public TextBook(TextBook object2)
   {
      setTitle(object2.title);
      setAuthor(object2.author);
      setPublisher(object2.publisher);
   }

   public void setTitle(String title)
   {
   	   this.title = title;
   }
   
   public void setAuthor(String aName)
   {
   	   author = aName;
   }
   
   public void setPublisher(String pub)
   {
   	   publisher = pub;
   }
   
   public String getTitle()
   {
   	   return title;
   }
   
   public String getAuthor()
   {
   	    return author;
   }
   
   public String getPublisher()
   {
   	   return publisher;
   }


   /**
      toString method
      @return A string containing the textbook
              information.
   */

   public String toString()
   {
      // Create a string representing the object.
      String str = String.format("Title: %s\nAuthor: %s\nPublisher: %s\n",title, author, publisher);

      // Return the string.
      return str;
   }
}