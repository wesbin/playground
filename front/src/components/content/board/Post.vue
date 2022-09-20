<script setup>
const props = defineProps({
  post: {
    required: true,
    type: Object,
  }
})
</script>

<template>
  <div class="post">
    Image
    <div class="post-title">
      {{ post.title }}
    </div>
  </div>
</template>

<style lang="scss" scoped>
.post {
  display: flex;
  position: relative;
  flex-direction: column;
  width: 100px;
  height: 100px;
  background-color: #c1c1c1;

  .post-title {
    position: absolute;
    bottom: 0;
    width: 100%;
    color: $WHITE-FONT;
    background-color: black;
    opacity: 30%;
  }
}
</style>