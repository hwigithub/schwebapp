<template>
    <div id="app-main" class="inner cover">
        <h1 class="cover-heading">{{ headingText }}</h1>
        <p class="lead">{{ leadText }}</p>
    </div>
</template>

<script>
export default {
  name: "app-main",
  data() {
    return {
      headingText: "Welcome dear visitor.",
      leadText: "This page will be replaced by a great site soon. It is hard to choose an awesome design, probably you know that :). Meanwhile, connect with me through the following social accounts."
    };
  }
};
</script>

<style lang="scss">
</style>