package com.eagle.dao.forum;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: eagle
 * Date: 14-8-3
 * Time: 下午11:01
 * To change this template use File | Settings | File Templates.
 */
public class ForumThread implements Serializable {
    public long tid;
    public long fid;
    public int postTableId;    //posttableid = '0';
    public int typeId;        //typeid = '0';
    public int sortId;        //sortid = '0';
    public int readPerm;     //readperm = 0;
    public int price ;       //= '0';
    public String author;
    public int authorId;   //authorid  = 0;
    public String subject;
    public int dateline ;    //= 0;
    public int lastPost;       // lastpost = 0;
    public String lastPoster;  //lastposter;
    public int views ;        // = 0;
    public long replies ;    //= 0;
    public int displayOrder; //displayorder = 0;
    public int highlight ;   //= 0;
    public int digest  ;      //= 0;
    public int rate ;        // = 0;
    public int special;     // = 0;
    public int attachment;   // = 0;
    public int moderated ;   //= 0;
    public int closed ;      //= 0;
    public int stickReply;  // stickreply = 0;
    public int recommends ;   // = '0';
    public int recommendAdd; //recommend_add = '0';
    public int recommendSub; // recommend_sub = '0';
    public int heats;          //= 0;
    public int status;        // = '0';
    public int isGroup;        //isgroup = 0;
    public long favTimes;     //favtimes = 0;
    public long shareTimes;  //sharetimes = 0;
    public int stamp ;        //= -1;
    public int icon ;        //= -1;
    public long pushedAid;  // pushedaid = 0;
    public int cover ;       //= '0';
    public int replyCredit;  //replycredit = '0';
    public String relateByTag; //relatebytag;
    public int maxPosition;   //maxposition = 0;
    public String bgColor;     // bgcolor;
    public int comments ;   //= 0;
    public int hidden ;     //= '0';

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    public long getFid() {
        return fid;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    public int getPostTableId() {
        return postTableId;
    }

    public void setPostTableId(int postTableId) {
        this.postTableId = postTableId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    public int getReadPerm() {
        return readPerm;
    }

    public void setReadPerm(int readPerm) {
        this.readPerm = readPerm;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getDateline() {
        return dateline;
    }

    public void setDateline(int dateline) {
        this.dateline = dateline;
    }

    public int getLastPost() {
        return lastPost;
    }

    public void setLastPost(int lastPost) {
        this.lastPost = lastPost;
    }

    public String getLastPoster() {
        return lastPoster;
    }

    public void setLastPoster(String lastPoster) {
        this.lastPoster = lastPoster;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public long getReplies() {
        return replies;
    }

    public void setReplies(long replies) {
        this.replies = replies;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public int getHighlight() {
        return highlight;
    }

    public void setHighlight(int highlight) {
        this.highlight = highlight;
    }

    public int getDigest() {
        return digest;
    }

    public void setDigest(int digest) {
        this.digest = digest;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getAttachment() {
        return attachment;
    }

    public void setAttachment(int attachment) {
        this.attachment = attachment;
    }

    public int getModerated() {
        return moderated;
    }

    public void setModerated(int moderated) {
        this.moderated = moderated;
    }

    public int getClosed() {
        return closed;
    }

    public void setClosed(int closed) {
        this.closed = closed;
    }

    public int getStickReply() {
        return stickReply;
    }

    public void setStickReply(int stickReply) {
        this.stickReply = stickReply;
    }

    public int getRecommends() {
        return recommends;
    }

    public void setRecommends(int recommends) {
        this.recommends = recommends;
    }

    public int getRecommendAdd() {
        return recommendAdd;
    }

    public void setRecommendAdd(int recommendAdd) {
        this.recommendAdd = recommendAdd;
    }

    public int getRecommendSub() {
        return recommendSub;
    }

    public void setRecommendSub(int recommendSub) {
        this.recommendSub = recommendSub;
    }

    public int getHeats() {
        return heats;
    }

    public void setHeats(int heats) {
        this.heats = heats;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getGroup() {
        return isGroup;
    }

    public void setGroup(int group) {
        isGroup = group;
    }

    public long getFavTimes() {
        return favTimes;
    }

    public void setFavTimes(long favTimes) {
        this.favTimes = favTimes;
    }

    public long getShareTimes() {
        return shareTimes;
    }

    public void setShareTimes(long shareTimes) {
        this.shareTimes = shareTimes;
    }

    public int getStamp() {
        return stamp;
    }

    public void setStamp(int stamp) {
        this.stamp = stamp;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public long getPushedAid() {
        return pushedAid;
    }

    public void setPushedAid(long pushedAid) {
        this.pushedAid = pushedAid;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public int getReplyCredit() {
        return replyCredit;
    }

    public void setReplyCredit(int replyCredit) {
        this.replyCredit = replyCredit;
    }

    public String getRelateByTag() {
        return relateByTag;
    }

    public void setRelateByTag(String relateByTag) {
        this.relateByTag = relateByTag;
    }

    public int getMaxPosition() {
        return maxPosition;
    }

    public void setMaxPosition(int maxPosition) {
        this.maxPosition = maxPosition;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getHidden() {
        return hidden;
    }

    public void setHidden(int hidden) {
        this.hidden = hidden;
    }

    @Override
    public String toString() {
        return "ForumThread{" +
                "tid=" + tid +
                ", fid=" + fid +
                ", postTableId=" + postTableId +
                ", typeId=" + typeId +
                ", sortId=" + sortId +
                ", readPerm=" + readPerm +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", authorId=" + authorId +
                ", subject='" + subject + '\'' +
                ", dateline=" + dateline +
                ", lastPost=" + lastPost +
                ", lastPoster='" + lastPoster + '\'' +
                ", views=" + views +
                ", replies=" + replies +
                ", displayOrder=" + displayOrder +
                ", highlight=" + highlight +
                ", digest=" + digest +
                ", rate=" + rate +
                ", special=" + special +
                ", attachment=" + attachment +
                ", moderated=" + moderated +
                ", closed=" + closed +
                ", stickReply=" + stickReply +
                ", recommends=" + recommends +
                ", recommendAdd=" + recommendAdd +
                ", recommendSub=" + recommendSub +
                ", heats=" + heats +
                ", status=" + status +
                ", isGroup=" + isGroup +
                ", favTimes=" + favTimes +
                ", shareTimes=" + shareTimes +
                ", stamp=" + stamp +
                ", icon=" + icon +
                ", pushedAid=" + pushedAid +
                ", cover=" + cover +
                ", replyCredit=" + replyCredit +
                ", relateByTag='" + relateByTag + '\'' +
                ", maxPosition=" + maxPosition +
                ", bgColor='" + bgColor + '\'' +
                ", comments=" + comments +
                ", hidden=" + hidden +
                '}';
    }
}
