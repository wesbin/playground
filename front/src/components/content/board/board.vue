<script setup>
const props = defineProps({
  tabs: {
    required: true,
    type: Array,
    validator(value) {
      return value.findIndex((tab) => !Object.keys(tab).includes('name')) < 0
    }
  }
});
</script>

<template>
  <div class="board">
    <div class="tab-section">Tab</div>
    <div class="post-section">Body</div>
  </div>
</template>

<style lang="scss" scoped>
.board {
  height: 300px;
  display: flex;
  flex-direction: column;

  .tab-section {
    border-bottom: 1px solid black;
    flex: 0 0 25px;
  }

  .post-section {
    flex: 1 0;
  }
}
</style>