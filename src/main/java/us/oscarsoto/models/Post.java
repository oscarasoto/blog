package us.oscarsoto.models;

import javax.persistence.*;

/**
 * @author oscarsoto on 1/5/17.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, length = 5000)
    private String body;

    public Post(int id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post() {

    }


//    private String imgURL;
//    public String getImgURL() {
//        return imgURL;
//    }
//
//    public void setImgURL(String imgURL) {
//        this.imgURL = imgURL;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString(){
        return this.title + " " + this.body;
    }


}
