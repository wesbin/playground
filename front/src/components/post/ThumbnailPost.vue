<script setup>
const props = defineProps({
  post: {
    required: true,
    type: Object,
  },
  onPostClicked: {
    required: true,
    type: Function
  }
})

const clickThumbnail = () => {
  props.onPostClicked(props.post)
}
</script>

<template>
  <!-- todo 작가(혹은 가수)를 표시할 영역도 넣어야 함  -->
  <div
    class="post"
    @click="clickThumbnail"
  >
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
  flex: 0 0 100px;
  height: 100px;
  background-color: #c1c1c1;
  cursor: pointer;

  .post-title {
    position: absolute;
    bottom: 0;
    width: 100%;
    color: $WHITE-FONT;
    background-color: black;
    opacity: 30%;
    user-select: none;
    text-overflow: ellipsis;
    white-space: nowrap;
    overflow: hidden;
  }
}
</style>