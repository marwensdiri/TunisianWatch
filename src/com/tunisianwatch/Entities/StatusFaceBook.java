/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tunisianwatch.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author asd
 */
public class StatusFaceBook {
    private String id;
    private String message;
    private List<CommentFaceBook> listComment = new ArrayList<CommentFaceBook>();
    private Date date;
    private long nblike;
  
    
    public long getNblike() {
        return nblike;
    }

    public void setNblike(long nblike) {
        this.nblike = nblike;
    }
    
    
    public void incrementLike(){
        this.nblike++;
    }
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   
    public void setId(String id){
        this.id=id;
    }
    
    public String getId(){
        return id;
    }
    
    public String getMessage() {
        return message;
    }

    public List<CommentFaceBook> getListComment() {
        return listComment;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setListComment(List<CommentFaceBook> listComment) {
        this.listComment = listComment;
    }
    
    public void addComment(CommentFaceBook comment){
        listComment.add(comment);
    }
}
