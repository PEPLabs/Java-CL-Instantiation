import Model.Album;
import Model.Artist;
import Model.Song;

public class Lab {
    /**
     * Java relies very heavily on OOP, so all of our code will rely on Objects.
     * An Object is an entity within Java that can contain state and behavior - for example, an
     * "Album" object may contain its own state (title, list of songs) and behavior (a method
     * called toString() that turns its state into a String). Although all "Album" objects are
     * based off of the same "Album" class as its template, you can have albums with different
     * states that thereby can exhibit different behavior. Every such separate "Album" object will
     * be considered an instance of "Album", hence the creation of an "Album" object is referred
     * to as "Instantiation".
     *
     * There have been three sample Java classes provided to you in the 'Model' folder, and all of
     * them have been provided with the code necessary for instantiation. You can instantiate and
     * return a new Album object by replacing the following method's code with the code
     *
     *      Album a = new Album();
     *      return a;
     *
     * TODO: return a new Album object.
     */
    public Album labPart1(){
        return null;
    }
    /**
     * Let's go over the different parts of the instantiation process.
     *      Album a = new Album();
     *      follows the format
     *      Type variableName = new Constructor();
     * The "Type" defines what behaviors the Object may exhibit. So, an Album Object may use the
     *      methods defined in Album.
     * "variableName" is the name of the Object's variable that we may reference later.
     * "new" is a keyword that specifies the creation of a new Object. You can think of this as
     *      informing Java to allocate some space in your computer's memory to hold any data within
     *      the object. This memory space is generally referred to as "Heap memory".
     * "Constructor" is a special type of method that builds the instance. Constructors are always
     *      named after the class they are in. You can find Album's constructor in the Album
     *      model, in the Model folder.
     *
     * That's the standard process for instantiating an Object. Strings and several other Objects follow
     *      a different process that will be explained later.
     *
     * TODO: Make this method instantiate and return any Object other than Album or String.
     *      You could use Artist, Song, or even the class "Object"
     */
    public Object labPart2(){
        return null;
    }
    /**
     * Strings (text such as "abc") are technically Objects, but they follow a different process.
     * It's common to reuse the same String, and there is no difference between identical Strings
     * like "abc" and "abc", so Java just stores all strings in use in a special memory region
     * called the "String Pool". Changing a string (eg "abc1") actually just generates a new string
     * without changing the original ("abc"), and for this reason Strings are technically immutable.
     *
     * Therefore, Strings are objects that can be created without the "new" keyword, such as
     *      String str1 = "abc";
     *
     * TODO: return a new String that isn't "abc".
     */
    public String labPart3(){
        return null;
    }
}