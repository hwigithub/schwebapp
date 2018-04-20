<template>
<div id="app-navbar" class="masthead clearfix">
    <div class="inner">
        <h3 class="masthead-brand">{{ projectTitle }}</h3>
        <nav class="nav nav-masthead">
        <a class="nav-link active" href="/">{{ home }}</a>
        <a class="nav-link" v-bind:href='prepareMailTo'>{{ contact }}</a>
        </nav>
    </div>
</div>
</template>

<script>
export default {
  name: "app-navbar",
  data() {
    return {
      contact: "Contact",
      home: "Home",
      mailTo: "hotoleanu.ciprian@gmail.com",
      projectTitle: "SCH Digital",
    };
  },
  computed: {
      prepareMailTo : function() {
          return "mailto:" + this.mailTo + "?subject=Message from sch.digital&body=Hi,I found you on http://sch.digital"
      }
  }
};
</script>

<style lang="scss">
</style>