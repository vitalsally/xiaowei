package com.tucaocun.entity;

public class NewsCentontWithBLOBs extends NewsCentont {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5238475714528820316L;

	private String newsTitle;

    private String newsStitle;

    private String source;

    private String tags;

    private String naviContent;

    private String content;

    private String metaKeyWords;

    private String metaDoc;

    private String seoTitle;

    private String seoTags;

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsStitle() {
        return newsStitle;
    }

    public void setNewsStitle(String newsStitle) {
        this.newsStitle = newsStitle == null ? null : newsStitle.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getNaviContent() {
        return naviContent;
    }

    public void setNaviContent(String naviContent) {
        this.naviContent = naviContent == null ? null : naviContent.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMetaKeyWords() {
        return metaKeyWords;
    }

    public void setMetaKeyWords(String metaKeyWords) {
        this.metaKeyWords = metaKeyWords == null ? null : metaKeyWords.trim();
    }

    public String getMetaDoc() {
        return metaDoc;
    }

    public void setMetaDoc(String metaDoc) {
        this.metaDoc = metaDoc == null ? null : metaDoc.trim();
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle == null ? null : seoTitle.trim();
    }

    public String getSeoTags() {
        return seoTags;
    }

    public void setSeoTags(String seoTags) {
        this.seoTags = seoTags == null ? null : seoTags.trim();
    }
}